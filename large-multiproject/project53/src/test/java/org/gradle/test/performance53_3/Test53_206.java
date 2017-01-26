package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_206 {
    private final Production53_206 production = new Production53_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}