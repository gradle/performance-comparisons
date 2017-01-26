package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_155 {
    private final Production10_155 production = new Production10_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}