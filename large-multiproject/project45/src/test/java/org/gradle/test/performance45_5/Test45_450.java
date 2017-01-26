package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_450 {
    private final Production45_450 production = new Production45_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}