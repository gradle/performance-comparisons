package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_468 {
    private final Production45_468 production = new Production45_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}