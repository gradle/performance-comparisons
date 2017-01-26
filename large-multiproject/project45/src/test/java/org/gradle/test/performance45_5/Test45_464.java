package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_464 {
    private final Production45_464 production = new Production45_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}