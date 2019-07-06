//
//  CustomGraph.m
//  CustomGraph
//
//  Created by Patrick Madden on 7/6/19.
//  Copyright © 2019 Binghamton University. All rights reserved.
//

#import "CustomGraph.h"

@implementation CustomGraph
@synthesize x;

// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect {
    // Drawing code
    CGContextRef context = UIGraphicsGetCurrentContext();
    CGRect bounds = [self bounds];
    
    [[UIColor colorWithRed:0 green:0 blue:0 alpha:1] setFill];
    CGContextFillRect(context, bounds);
    
    [[UIColor colorWithRed:1 green:0 blue:0 alpha:1] setFill];
    CGRect r = CGRectMake(x * bounds.size.width, x * bounds.size.height, 100, 100);
    CGContextFillEllipseInRect(context, r);
    
}


@end
