package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_174 {
    private final Production53_174 production = new Production53_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}