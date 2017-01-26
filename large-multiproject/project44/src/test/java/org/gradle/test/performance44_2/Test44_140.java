package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_140 {
    private final Production44_140 production = new Production44_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}