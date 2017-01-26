package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_64 {
    private final Production44_64 production = new Production44_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}