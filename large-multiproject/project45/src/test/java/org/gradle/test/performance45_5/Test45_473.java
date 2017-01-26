package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_473 {
    private final Production45_473 production = new Production45_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}