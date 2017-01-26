package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_358 {
    private final Production44_358 production = new Production44_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}