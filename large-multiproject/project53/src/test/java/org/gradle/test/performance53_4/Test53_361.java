package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_361 {
    private final Production53_361 production = new Production53_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}