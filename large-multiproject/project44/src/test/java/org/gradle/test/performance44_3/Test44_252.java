package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_252 {
    private final Production44_252 production = new Production44_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}