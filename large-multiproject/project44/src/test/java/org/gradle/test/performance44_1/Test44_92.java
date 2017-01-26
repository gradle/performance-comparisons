package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_92 {
    private final Production44_92 production = new Production44_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}