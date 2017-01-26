package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_202 {
    private final Production53_202 production = new Production53_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}