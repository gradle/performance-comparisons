package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_431 {
    private final Production45_431 production = new Production45_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}