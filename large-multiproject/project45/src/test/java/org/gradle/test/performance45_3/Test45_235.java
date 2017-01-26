package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_235 {
    private final Production45_235 production = new Production45_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}