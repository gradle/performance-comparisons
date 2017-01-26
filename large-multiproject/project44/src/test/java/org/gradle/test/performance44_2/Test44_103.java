package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_103 {
    private final Production44_103 production = new Production44_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}