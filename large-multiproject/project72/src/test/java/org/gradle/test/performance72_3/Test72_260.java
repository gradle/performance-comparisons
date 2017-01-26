package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_260 {
    private final Production72_260 production = new Production72_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}