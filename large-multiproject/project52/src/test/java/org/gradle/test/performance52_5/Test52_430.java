package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_430 {
    private final Production52_430 production = new Production52_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}