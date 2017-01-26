package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_37 {
    private final Production45_37 production = new Production45_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}