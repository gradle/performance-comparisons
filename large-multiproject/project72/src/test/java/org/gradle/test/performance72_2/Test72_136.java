package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_136 {
    private final Production72_136 production = new Production72_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}