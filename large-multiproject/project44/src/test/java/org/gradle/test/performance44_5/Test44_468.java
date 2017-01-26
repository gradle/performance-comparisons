package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_468 {
    private final Production44_468 production = new Production44_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}