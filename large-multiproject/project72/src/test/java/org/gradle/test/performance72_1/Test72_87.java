package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_87 {
    private final Production72_87 production = new Production72_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}