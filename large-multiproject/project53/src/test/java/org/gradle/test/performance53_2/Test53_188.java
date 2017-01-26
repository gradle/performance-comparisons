package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_188 {
    private final Production53_188 production = new Production53_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}