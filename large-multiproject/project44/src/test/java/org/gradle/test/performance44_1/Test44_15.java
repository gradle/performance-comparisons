package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_15 {
    private final Production44_15 production = new Production44_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}