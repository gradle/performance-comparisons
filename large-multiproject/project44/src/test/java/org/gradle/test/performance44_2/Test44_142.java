package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_142 {
    private final Production44_142 production = new Production44_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}