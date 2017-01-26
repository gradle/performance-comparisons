package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_42 {
    private final Production72_42 production = new Production72_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}