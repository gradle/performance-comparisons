package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_171 {
    private final Production44_171 production = new Production44_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}