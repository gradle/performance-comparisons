package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_224 {
    private final Production85_224 production = new Production85_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}