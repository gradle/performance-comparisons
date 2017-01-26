package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_155 {
    private final Production77_155 production = new Production77_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}