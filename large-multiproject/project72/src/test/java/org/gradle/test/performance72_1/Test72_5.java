package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_5 {
    private final Production72_5 production = new Production72_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}