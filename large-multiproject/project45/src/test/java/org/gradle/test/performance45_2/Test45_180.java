package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_180 {
    private final Production45_180 production = new Production45_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}