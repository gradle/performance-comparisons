package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_235 {
    private final Production72_235 production = new Production72_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}