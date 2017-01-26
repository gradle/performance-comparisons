package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_15 {
    private final Production45_15 production = new Production45_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}