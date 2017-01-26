package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_46 {
    private final Production44_46 production = new Production44_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}