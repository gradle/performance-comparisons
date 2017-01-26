package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_411 {
    private final Production53_411 production = new Production53_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}