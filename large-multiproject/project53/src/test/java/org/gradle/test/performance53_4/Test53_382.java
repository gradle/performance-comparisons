package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_382 {
    private final Production53_382 production = new Production53_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}