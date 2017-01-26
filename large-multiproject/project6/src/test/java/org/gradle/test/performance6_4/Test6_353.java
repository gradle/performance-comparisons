package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_353 {
    private final Production6_353 production = new Production6_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}