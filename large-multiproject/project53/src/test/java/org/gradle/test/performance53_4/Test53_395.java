package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_395 {
    private final Production53_395 production = new Production53_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}