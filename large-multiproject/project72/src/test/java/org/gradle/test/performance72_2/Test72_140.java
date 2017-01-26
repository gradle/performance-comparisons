package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_140 {
    private final Production72_140 production = new Production72_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}