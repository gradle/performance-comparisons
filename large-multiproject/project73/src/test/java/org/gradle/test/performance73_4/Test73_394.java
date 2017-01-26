package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_394 {
    private final Production73_394 production = new Production73_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}