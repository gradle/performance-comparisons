package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_214 {
    private final Production53_214 production = new Production53_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}