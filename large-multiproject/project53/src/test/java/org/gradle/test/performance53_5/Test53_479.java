package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_479 {
    private final Production53_479 production = new Production53_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}