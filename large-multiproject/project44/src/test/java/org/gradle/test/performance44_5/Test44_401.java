package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_401 {
    private final Production44_401 production = new Production44_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}