package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_224 {
    private final Production73_224 production = new Production73_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}