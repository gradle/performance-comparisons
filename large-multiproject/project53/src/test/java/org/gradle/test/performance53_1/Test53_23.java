package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_23 {
    private final Production53_23 production = new Production53_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}