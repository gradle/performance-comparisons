package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_35 {
    private final Production72_35 production = new Production72_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}