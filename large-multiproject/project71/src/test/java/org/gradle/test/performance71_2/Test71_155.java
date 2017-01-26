package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_155 {
    private final Production71_155 production = new Production71_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}