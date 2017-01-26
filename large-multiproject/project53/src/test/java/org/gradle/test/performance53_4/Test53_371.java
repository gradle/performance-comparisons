package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_371 {
    private final Production53_371 production = new Production53_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}