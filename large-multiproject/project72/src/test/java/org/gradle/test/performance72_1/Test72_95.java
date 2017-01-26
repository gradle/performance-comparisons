package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_95 {
    private final Production72_95 production = new Production72_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}