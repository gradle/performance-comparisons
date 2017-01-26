package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_173 {
    private final Production53_173 production = new Production53_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}