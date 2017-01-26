package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_224 {
    private final Production29_224 production = new Production29_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}