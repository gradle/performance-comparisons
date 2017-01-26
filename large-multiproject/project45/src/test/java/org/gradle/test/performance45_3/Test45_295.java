package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_295 {
    private final Production45_295 production = new Production45_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}