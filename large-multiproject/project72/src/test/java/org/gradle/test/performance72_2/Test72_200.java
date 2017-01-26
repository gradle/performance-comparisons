package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_200 {
    private final Production72_200 production = new Production72_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}