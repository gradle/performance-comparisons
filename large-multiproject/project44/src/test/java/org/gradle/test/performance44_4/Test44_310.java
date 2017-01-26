package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_310 {
    private final Production44_310 production = new Production44_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}