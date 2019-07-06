//
//  ViewController.m
//  CustomGraph
//
//  Created by Patrick Madden on 7/6/19.
//  Copyright © 2019 Binghamton University. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController
@synthesize customGraph;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
}

-(IBAction)sliderChanged:(id)sender
{
    UISlider *slider = (UISlider *)sender;
    
    NSLog(@"Slider value %f", [slider value]);
    [customGraph setX:[slider value]];
    [customGraph setNeedsDisplay];
}


@end
