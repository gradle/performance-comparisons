package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_469 {
    private final Production53_469 production = new Production53_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}