package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_31 {
    private final Production44_31 production = new Production44_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}