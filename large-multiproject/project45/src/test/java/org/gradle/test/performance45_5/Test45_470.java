package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_470 {
    private final Production45_470 production = new Production45_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}