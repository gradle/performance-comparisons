package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_1 {
    private final Production44_1 production = new Production44_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}