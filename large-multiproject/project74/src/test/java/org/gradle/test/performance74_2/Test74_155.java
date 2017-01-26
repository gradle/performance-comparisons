package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_155 {
    private final Production74_155 production = new Production74_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}