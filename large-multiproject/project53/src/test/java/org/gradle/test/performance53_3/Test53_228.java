package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_228 {
    private final Production53_228 production = new Production53_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}