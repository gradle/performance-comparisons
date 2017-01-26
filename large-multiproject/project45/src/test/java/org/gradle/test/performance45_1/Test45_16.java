package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_16 {
    private final Production45_16 production = new Production45_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}