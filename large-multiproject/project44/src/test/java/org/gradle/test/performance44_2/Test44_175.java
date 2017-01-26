package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_175 {
    private final Production44_175 production = new Production44_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}