package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_224 {
    private final Production36_224 production = new Production36_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}