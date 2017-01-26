package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_286 {
    private final Production44_286 production = new Production44_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}