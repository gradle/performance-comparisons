package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_486 {
    private final Production45_486 production = new Production45_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}