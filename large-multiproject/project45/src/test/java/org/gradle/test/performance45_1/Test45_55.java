package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_55 {
    private final Production45_55 production = new Production45_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}