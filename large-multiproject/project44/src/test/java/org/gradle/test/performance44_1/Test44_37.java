package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_37 {
    private final Production44_37 production = new Production44_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}