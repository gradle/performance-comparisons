package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_153 {
    private final Production53_153 production = new Production53_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}