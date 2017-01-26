package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_218 {
    private final Production44_218 production = new Production44_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}