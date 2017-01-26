package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_486 {
    private final Production53_486 production = new Production53_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}