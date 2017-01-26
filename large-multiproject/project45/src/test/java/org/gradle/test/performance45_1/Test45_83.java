package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_83 {
    private final Production45_83 production = new Production45_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}