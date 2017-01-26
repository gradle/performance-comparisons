package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_7 {
    private final Production72_7 production = new Production72_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}