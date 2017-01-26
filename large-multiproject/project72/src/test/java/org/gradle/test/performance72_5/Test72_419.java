package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_419 {
    private final Production72_419 production = new Production72_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}