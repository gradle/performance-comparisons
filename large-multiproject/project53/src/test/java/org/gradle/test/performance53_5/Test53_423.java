package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_423 {
    private final Production53_423 production = new Production53_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}