package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_14 {
    private final Production53_14 production = new Production53_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}