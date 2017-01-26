package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_394 {
    private final Production45_394 production = new Production45_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}