package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_489 {
    private final Production45_489 production = new Production45_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}