package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_155 {
    private final Production24_155 production = new Production24_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}