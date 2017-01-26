package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_150 {
    private final Production72_150 production = new Production72_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}