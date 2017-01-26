package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_139 {
    private final Production53_139 production = new Production53_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}