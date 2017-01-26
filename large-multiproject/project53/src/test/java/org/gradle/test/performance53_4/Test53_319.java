package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_319 {
    private final Production53_319 production = new Production53_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}