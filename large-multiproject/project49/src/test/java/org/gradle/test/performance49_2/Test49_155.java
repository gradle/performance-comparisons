package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_155 {
    private final Production49_155 production = new Production49_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}