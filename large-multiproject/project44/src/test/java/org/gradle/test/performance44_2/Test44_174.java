package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_174 {
    private final Production44_174 production = new Production44_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}