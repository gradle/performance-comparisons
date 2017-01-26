package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_7 {
    private final Production44_7 production = new Production44_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}