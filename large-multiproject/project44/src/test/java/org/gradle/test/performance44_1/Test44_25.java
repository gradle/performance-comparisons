package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_25 {
    private final Production44_25 production = new Production44_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}