package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_237 {
    private final Production44_237 production = new Production44_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}