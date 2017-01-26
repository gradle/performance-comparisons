package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_52 {
    private final Production45_52 production = new Production45_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}