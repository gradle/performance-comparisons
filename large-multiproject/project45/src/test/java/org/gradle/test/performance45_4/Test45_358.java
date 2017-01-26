package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_358 {
    private final Production45_358 production = new Production45_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}