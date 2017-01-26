package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_137 {
    private final Production45_137 production = new Production45_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}