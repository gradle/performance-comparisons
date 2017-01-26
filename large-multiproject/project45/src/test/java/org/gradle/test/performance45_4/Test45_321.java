package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_321 {
    private final Production45_321 production = new Production45_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}