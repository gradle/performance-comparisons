package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_488 {
    private final Production44_488 production = new Production44_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}