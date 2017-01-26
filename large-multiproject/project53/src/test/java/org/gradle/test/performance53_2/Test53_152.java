package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_152 {
    private final Production53_152 production = new Production53_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}