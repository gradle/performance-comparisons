package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_155 {
    private final Production17_155 production = new Production17_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}