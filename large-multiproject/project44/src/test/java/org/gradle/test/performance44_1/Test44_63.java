package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_63 {
    private final Production44_63 production = new Production44_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}