package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_350 {
    private final Production53_350 production = new Production53_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}