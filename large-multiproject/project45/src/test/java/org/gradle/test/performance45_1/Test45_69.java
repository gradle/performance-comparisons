package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_69 {
    private final Production45_69 production = new Production45_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}