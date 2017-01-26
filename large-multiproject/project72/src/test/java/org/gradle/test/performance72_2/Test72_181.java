package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_181 {
    private final Production72_181 production = new Production72_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}