package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_295 {
    private final Production44_295 production = new Production44_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}