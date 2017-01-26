package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_104 {
    private final Production44_104 production = new Production44_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}