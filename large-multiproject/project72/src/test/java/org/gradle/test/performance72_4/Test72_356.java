package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_356 {
    private final Production72_356 production = new Production72_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}