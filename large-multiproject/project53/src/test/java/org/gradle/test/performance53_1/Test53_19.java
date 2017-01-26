package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_19 {
    private final Production53_19 production = new Production53_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}