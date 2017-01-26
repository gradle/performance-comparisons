package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_476 {
    private final Production44_476 production = new Production44_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}