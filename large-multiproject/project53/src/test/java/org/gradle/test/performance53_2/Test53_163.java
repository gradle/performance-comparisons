package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_163 {
    private final Production53_163 production = new Production53_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}