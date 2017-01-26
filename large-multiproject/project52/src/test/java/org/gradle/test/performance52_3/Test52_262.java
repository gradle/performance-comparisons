package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_262 {
    private final Production52_262 production = new Production52_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}