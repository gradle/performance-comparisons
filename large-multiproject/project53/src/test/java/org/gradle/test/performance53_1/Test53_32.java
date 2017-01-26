package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_32 {
    private final Production53_32 production = new Production53_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}