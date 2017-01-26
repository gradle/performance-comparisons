package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_191 {
    private final Production7_191 production = new Production7_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}