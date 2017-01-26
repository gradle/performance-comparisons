package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_70 {
    private final Production45_70 production = new Production45_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}