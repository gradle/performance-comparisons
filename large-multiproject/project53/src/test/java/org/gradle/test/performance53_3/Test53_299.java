package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_299 {
    private final Production53_299 production = new Production53_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}