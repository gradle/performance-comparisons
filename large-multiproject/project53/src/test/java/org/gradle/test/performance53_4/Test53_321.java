package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_321 {
    private final Production53_321 production = new Production53_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}