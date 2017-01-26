package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_155 {
    private final Production23_155 production = new Production23_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}