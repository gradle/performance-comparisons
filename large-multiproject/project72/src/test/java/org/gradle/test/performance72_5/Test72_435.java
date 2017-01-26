package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_435 {
    private final Production72_435 production = new Production72_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}