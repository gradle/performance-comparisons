package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_155 {
    private final Production73_155 production = new Production73_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}