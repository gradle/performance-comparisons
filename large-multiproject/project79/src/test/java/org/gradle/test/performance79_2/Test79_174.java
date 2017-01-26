package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_174 {
    private final Production79_174 production = new Production79_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}