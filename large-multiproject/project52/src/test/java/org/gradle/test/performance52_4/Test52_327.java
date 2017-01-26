package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_327 {
    private final Production52_327 production = new Production52_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}