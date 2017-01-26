package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_434 {
    private final Production53_434 production = new Production53_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}