package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_127 {
    private final Production45_127 production = new Production45_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}