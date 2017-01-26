package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_320 {
    private final Production45_320 production = new Production45_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}