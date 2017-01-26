package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_215 {
    private final Production44_215 production = new Production44_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}