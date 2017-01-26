package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_452 {
    private final Production53_452 production = new Production53_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}