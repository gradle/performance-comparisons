package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_224 {
    private final Production45_224 production = new Production45_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}