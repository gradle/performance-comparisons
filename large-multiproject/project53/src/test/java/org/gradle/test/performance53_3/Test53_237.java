package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_237 {
    private final Production53_237 production = new Production53_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}