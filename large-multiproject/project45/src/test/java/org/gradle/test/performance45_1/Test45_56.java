package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_56 {
    private final Production45_56 production = new Production45_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}