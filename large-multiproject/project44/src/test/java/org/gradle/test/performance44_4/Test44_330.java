package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_330 {
    private final Production44_330 production = new Production44_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}