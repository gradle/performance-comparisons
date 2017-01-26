package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_422 {
    private final Production72_422 production = new Production72_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}