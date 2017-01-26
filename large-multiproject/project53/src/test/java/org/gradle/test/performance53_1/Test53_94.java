package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_94 {
    private final Production53_94 production = new Production53_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}