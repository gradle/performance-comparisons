package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_224 {
    private final Production44_224 production = new Production44_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}