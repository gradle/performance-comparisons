package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_270 {
    private final Production44_270 production = new Production44_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}