package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_192 {
    private final Production44_192 production = new Production44_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}