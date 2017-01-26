package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_146 {
    private final Production72_146 production = new Production72_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}