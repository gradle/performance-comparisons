package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_334 {
    private final Production53_334 production = new Production53_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}