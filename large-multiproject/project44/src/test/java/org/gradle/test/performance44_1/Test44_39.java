package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_39 {
    private final Production44_39 production = new Production44_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}