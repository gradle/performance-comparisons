package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_155 {
    private final Production97_155 production = new Production97_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}