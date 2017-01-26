package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_201 {
    private final Production53_201 production = new Production53_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}