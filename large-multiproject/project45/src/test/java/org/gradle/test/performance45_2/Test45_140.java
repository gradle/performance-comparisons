package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_140 {
    private final Production45_140 production = new Production45_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}