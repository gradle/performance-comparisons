package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_227 {
    private final Production53_227 production = new Production53_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}