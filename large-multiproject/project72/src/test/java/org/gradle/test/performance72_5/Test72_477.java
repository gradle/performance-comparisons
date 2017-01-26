package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_477 {
    private final Production72_477 production = new Production72_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}