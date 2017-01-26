package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_114 {
    private final Production44_114 production = new Production44_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}