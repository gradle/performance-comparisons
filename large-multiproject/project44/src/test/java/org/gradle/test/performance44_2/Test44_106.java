package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_106 {
    private final Production44_106 production = new Production44_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}