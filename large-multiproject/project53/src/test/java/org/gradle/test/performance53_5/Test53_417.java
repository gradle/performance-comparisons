package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_417 {
    private final Production53_417 production = new Production53_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}