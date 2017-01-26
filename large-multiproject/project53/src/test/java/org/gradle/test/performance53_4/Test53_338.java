package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_338 {
    private final Production53_338 production = new Production53_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}