package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_322 {
    private final Production53_322 production = new Production53_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}