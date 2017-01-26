package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_137 {
    private final Production44_137 production = new Production44_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}