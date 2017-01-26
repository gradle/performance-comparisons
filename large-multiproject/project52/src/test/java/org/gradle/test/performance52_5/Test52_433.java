package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_433 {
    private final Production52_433 production = new Production52_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}