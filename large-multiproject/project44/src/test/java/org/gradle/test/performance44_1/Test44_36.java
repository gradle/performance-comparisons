package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_36 {
    private final Production44_36 production = new Production44_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}