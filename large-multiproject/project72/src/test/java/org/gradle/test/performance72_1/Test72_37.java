package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_37 {
    private final Production72_37 production = new Production72_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}