package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_131 {
    private final Production45_131 production = new Production45_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}