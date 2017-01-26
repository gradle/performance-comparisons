package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_257 {
    private final Production53_257 production = new Production53_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}