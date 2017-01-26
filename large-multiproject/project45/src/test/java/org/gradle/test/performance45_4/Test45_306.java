package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_306 {
    private final Production45_306 production = new Production45_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}