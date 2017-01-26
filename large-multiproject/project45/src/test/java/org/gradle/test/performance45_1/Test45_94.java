package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_94 {
    private final Production45_94 production = new Production45_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}