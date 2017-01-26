package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_51 {
    private final Production72_51 production = new Production72_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}