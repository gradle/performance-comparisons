package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_28 {
    private final Production44_28 production = new Production44_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}