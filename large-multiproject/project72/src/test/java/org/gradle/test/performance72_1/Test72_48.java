package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_48 {
    private final Production72_48 production = new Production72_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}