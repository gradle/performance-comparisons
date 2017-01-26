package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_203 {
    private final Production44_203 production = new Production44_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}