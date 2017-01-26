package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_300 {
    private final Production53_300 production = new Production53_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}