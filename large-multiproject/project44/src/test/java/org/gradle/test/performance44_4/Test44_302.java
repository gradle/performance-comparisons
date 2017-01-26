package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_302 {
    private final Production44_302 production = new Production44_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}