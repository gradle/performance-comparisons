package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_61 {
    private final Production72_61 production = new Production72_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}