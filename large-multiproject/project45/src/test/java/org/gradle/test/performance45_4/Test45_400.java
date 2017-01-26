package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_400 {
    private final Production45_400 production = new Production45_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}