package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_396 {
    private final Production53_396 production = new Production53_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}