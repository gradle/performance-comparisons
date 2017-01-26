package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_123 {
    private final Production52_123 production = new Production52_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}