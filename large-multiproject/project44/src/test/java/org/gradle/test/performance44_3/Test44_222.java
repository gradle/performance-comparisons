package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_222 {
    private final Production44_222 production = new Production44_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}