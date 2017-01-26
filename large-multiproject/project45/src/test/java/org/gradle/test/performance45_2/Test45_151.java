package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_151 {
    private final Production45_151 production = new Production45_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}