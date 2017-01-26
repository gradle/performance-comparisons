package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_89 {
    private final Production53_89 production = new Production53_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}