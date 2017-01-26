package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_469 {
    private final Production45_469 production = new Production45_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}