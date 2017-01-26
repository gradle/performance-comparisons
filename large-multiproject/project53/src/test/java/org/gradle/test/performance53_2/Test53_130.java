package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_130 {
    private final Production53_130 production = new Production53_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}