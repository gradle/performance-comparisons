package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_186 {
    private final Production53_186 production = new Production53_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}