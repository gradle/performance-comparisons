package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_434 {
    private final Production45_434 production = new Production45_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}