package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_254 {
    private final Production44_254 production = new Production44_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}