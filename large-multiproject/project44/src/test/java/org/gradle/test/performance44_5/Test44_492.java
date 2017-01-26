package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_492 {
    private final Production44_492 production = new Production44_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}