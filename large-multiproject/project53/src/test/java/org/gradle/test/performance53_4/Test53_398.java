package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_398 {
    private final Production53_398 production = new Production53_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}