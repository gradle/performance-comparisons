package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_271 {
    private final Production45_271 production = new Production45_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}