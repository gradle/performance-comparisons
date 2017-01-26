package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_377 {
    private final Production53_377 production = new Production53_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}