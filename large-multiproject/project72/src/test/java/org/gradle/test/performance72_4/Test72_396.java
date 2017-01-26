package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_396 {
    private final Production72_396 production = new Production72_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}