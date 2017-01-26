package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_155 {
    private final Production81_155 production = new Production81_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}