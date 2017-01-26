package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_174 {
    private final Production45_174 production = new Production45_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}