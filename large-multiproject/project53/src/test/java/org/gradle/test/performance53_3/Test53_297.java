package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_297 {
    private final Production53_297 production = new Production53_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}