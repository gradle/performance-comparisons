package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_222 {
    private final Production53_222 production = new Production53_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}