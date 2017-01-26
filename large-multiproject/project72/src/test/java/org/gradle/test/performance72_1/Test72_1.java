package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_1 {
    private final Production72_1 production = new Production72_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}