package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_158 {
    private final Production45_158 production = new Production45_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}