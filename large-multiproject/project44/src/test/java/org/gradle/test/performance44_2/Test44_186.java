package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_186 {
    private final Production44_186 production = new Production44_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}