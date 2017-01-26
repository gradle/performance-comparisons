package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_155 {
    private final Production33_155 production = new Production33_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}