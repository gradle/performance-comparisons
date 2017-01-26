package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_142 {
    private final Production45_142 production = new Production45_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}