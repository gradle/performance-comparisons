package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_381 {
    private final Production44_381 production = new Production44_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}