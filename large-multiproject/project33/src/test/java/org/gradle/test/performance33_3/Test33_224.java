package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_224 {
    private final Production33_224 production = new Production33_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}