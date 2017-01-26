package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_33 {
    private final Production44_33 production = new Production44_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}