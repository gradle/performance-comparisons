package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_191 {
    private final Production45_191 production = new Production45_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}