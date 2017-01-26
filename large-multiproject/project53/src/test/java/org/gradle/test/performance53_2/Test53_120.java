package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_120 {
    private final Production53_120 production = new Production53_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}