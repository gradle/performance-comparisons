package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_286 {
    private final Production53_286 production = new Production53_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}