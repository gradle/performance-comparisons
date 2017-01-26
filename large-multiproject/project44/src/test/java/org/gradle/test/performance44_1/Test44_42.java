package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_42 {
    private final Production44_42 production = new Production44_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}