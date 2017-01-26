package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_343 {
    private final Production45_343 production = new Production45_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}