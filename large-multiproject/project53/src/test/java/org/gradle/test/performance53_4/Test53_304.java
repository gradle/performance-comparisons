package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_304 {
    private final Production53_304 production = new Production53_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}