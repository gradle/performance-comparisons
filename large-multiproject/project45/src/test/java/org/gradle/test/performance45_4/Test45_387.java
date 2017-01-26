package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_387 {
    private final Production45_387 production = new Production45_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}