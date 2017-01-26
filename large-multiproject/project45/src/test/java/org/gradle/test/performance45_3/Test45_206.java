package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_206 {
    private final Production45_206 production = new Production45_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}