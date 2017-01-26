package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_224 {
    private final Production79_224 production = new Production79_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}