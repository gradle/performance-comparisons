package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_191 {
    private final Production72_191 production = new Production72_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}