package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_213 {
    private final Production45_213 production = new Production45_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}