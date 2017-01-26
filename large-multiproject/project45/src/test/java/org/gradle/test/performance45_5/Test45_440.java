package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_440 {
    private final Production45_440 production = new Production45_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}