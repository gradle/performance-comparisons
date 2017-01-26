package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_90 {
    private final Production44_90 production = new Production44_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}