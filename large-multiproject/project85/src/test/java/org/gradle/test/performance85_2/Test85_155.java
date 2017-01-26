package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_155 {
    private final Production85_155 production = new Production85_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}