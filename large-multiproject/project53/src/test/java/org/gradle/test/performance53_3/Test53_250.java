package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_250 {
    private final Production53_250 production = new Production53_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}