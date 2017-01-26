package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_155 {
    private final Production45_155 production = new Production45_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}