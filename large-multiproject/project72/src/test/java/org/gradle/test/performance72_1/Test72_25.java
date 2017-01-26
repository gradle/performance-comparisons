package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_25 {
    private final Production72_25 production = new Production72_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}