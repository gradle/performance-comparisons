package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_138 {
    private final Production53_138 production = new Production53_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}