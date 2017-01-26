package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_440 {
    private final Production44_440 production = new Production44_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}