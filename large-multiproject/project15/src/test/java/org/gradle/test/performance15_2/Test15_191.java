package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_191 {
    private final Production15_191 production = new Production15_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}