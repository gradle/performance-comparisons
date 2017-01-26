package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_155 {
    private final Production60_155 production = new Production60_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}