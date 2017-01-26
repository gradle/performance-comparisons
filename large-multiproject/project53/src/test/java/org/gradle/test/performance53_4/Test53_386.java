package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_386 {
    private final Production53_386 production = new Production53_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}