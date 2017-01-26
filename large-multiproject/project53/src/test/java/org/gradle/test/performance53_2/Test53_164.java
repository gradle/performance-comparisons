package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_164 {
    private final Production53_164 production = new Production53_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}