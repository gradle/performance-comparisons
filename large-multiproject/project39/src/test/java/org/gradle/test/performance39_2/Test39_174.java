package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_174 {
    private final Production39_174 production = new Production39_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}