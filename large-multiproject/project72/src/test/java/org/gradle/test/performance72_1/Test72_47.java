package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_47 {
    private final Production72_47 production = new Production72_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}