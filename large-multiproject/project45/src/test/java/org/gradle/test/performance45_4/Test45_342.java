package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_342 {
    private final Production45_342 production = new Production45_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}