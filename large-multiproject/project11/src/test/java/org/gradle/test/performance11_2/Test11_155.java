package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_155 {
    private final Production11_155 production = new Production11_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}