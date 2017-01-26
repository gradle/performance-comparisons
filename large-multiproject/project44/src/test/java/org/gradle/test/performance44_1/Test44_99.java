package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_99 {
    private final Production44_99 production = new Production44_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}