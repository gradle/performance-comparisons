package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_339 {
    private final Production44_339 production = new Production44_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}