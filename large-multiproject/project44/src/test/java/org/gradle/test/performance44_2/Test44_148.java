package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_148 {
    private final Production44_148 production = new Production44_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}