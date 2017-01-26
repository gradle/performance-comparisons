package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_424 {
    private final Production45_424 production = new Production45_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}