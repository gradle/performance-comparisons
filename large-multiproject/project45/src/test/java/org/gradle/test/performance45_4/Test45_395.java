package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_395 {
    private final Production45_395 production = new Production45_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}