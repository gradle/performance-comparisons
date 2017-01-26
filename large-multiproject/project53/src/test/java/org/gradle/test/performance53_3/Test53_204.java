package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_204 {
    private final Production53_204 production = new Production53_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}