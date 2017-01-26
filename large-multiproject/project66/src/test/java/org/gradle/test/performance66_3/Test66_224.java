package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_224 {
    private final Production66_224 production = new Production66_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}