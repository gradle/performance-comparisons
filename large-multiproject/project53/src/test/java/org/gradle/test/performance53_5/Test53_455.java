package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_455 {
    private final Production53_455 production = new Production53_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}