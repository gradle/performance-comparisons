package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_483 {
    private final Production45_483 production = new Production45_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}