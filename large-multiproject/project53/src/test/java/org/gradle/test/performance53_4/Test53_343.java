package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_343 {
    private final Production53_343 production = new Production53_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}