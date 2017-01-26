package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_21 {
    private final Production45_21 production = new Production45_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}