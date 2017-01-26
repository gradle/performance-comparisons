package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_70 {
    private final Production53_70 production = new Production53_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}