package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_148 {
    private final Production53_148 production = new Production53_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}