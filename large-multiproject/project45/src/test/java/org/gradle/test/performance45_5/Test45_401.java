package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_401 {
    private final Production45_401 production = new Production45_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}