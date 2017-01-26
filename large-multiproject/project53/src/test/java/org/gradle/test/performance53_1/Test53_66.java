package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_66 {
    private final Production53_66 production = new Production53_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}