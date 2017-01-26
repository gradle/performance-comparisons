package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_145 {
    private final Production53_145 production = new Production53_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}