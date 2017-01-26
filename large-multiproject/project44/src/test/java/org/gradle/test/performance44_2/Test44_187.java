package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_187 {
    private final Production44_187 production = new Production44_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}