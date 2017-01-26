package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_61 {
    private final Production44_61 production = new Production44_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}