package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_390 {
    private final Production53_390 production = new Production53_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}