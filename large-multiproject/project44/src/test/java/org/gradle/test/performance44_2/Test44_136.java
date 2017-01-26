package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_136 {
    private final Production44_136 production = new Production44_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}