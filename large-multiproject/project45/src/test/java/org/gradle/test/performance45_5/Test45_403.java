package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_403 {
    private final Production45_403 production = new Production45_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}