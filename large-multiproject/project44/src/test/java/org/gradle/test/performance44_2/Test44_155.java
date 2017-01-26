package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_155 {
    private final Production44_155 production = new Production44_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}