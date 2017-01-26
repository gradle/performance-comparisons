package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_137 {
    private final Production72_137 production = new Production72_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}