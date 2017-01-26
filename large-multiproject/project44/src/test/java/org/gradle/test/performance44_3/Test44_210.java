package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_210 {
    private final Production44_210 production = new Production44_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}