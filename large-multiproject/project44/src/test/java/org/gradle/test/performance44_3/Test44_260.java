package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_260 {
    private final Production44_260 production = new Production44_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}