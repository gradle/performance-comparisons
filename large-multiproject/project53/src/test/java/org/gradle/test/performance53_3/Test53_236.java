package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_236 {
    private final Production53_236 production = new Production53_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}