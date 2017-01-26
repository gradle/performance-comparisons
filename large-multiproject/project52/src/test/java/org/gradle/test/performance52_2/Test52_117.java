package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_117 {
    private final Production52_117 production = new Production52_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}