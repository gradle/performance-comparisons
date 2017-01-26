package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_418 {
    private final Production72_418 production = new Production72_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}