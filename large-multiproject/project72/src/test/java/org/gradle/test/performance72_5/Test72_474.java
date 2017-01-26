package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_474 {
    private final Production72_474 production = new Production72_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}