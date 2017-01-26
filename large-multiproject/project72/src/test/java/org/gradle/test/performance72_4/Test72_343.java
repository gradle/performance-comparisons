package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_343 {
    private final Production72_343 production = new Production72_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}