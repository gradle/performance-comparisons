package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_394 {
    private final Production52_394 production = new Production52_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}