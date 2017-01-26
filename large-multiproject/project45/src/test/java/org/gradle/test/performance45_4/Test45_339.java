package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_339 {
    private final Production45_339 production = new Production45_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}