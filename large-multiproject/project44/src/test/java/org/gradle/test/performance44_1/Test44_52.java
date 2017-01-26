package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_52 {
    private final Production44_52 production = new Production44_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}