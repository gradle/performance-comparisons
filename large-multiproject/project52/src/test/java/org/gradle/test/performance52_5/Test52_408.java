package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_408 {
    private final Production52_408 production = new Production52_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}