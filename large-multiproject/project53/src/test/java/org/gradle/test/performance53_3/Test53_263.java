package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_263 {
    private final Production53_263 production = new Production53_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}