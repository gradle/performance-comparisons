package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_53 {
    private final Production44_53 production = new Production44_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}