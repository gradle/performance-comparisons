package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_6 {
    private final Production72_6 production = new Production72_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}