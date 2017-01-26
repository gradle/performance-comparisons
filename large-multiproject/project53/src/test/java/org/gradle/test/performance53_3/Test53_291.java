package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_291 {
    private final Production53_291 production = new Production53_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}