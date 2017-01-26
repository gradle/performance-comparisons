package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_164 {
    private final Production44_164 production = new Production44_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}