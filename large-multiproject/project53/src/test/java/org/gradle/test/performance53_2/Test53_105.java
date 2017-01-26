package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_105 {
    private final Production53_105 production = new Production53_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}