package com.hangox.testwithgroovy

import org.junit.Test

/**
 * Created With Android Studio
 * User hangox 
 * Date 2017/10/16
 * Time 下午4:25
 */

class CalculatorTest extends GroovyTestCase {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals 2, calculator.add(1, 1)

        def test  = ['12','23']
    }
}
