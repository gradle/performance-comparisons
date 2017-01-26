package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_224 {
    private final Production52_224 production = new Production52_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}