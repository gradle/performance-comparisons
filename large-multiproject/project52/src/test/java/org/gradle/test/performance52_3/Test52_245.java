package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_245 {
    private final Production52_245 production = new Production52_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}