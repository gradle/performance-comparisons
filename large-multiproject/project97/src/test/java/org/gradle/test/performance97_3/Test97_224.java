package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_224 {
    private final Production97_224 production = new Production97_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}