package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_10 {
    private final Production53_10 production = new Production53_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}