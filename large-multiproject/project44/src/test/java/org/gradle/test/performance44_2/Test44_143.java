package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_143 {
    private final Production44_143 production = new Production44_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}