package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_55 {
    private final Production53_55 production = new Production53_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}