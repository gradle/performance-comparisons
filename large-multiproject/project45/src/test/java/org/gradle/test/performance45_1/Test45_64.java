package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_64 {
    private final Production45_64 production = new Production45_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}