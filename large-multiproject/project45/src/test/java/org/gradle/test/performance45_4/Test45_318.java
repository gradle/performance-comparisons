package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_318 {
    private final Production45_318 production = new Production45_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}