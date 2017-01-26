package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_455 {
    private final Production44_455 production = new Production44_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}