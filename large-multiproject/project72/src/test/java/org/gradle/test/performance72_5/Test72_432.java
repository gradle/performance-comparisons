package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_432 {
    private final Production72_432 production = new Production72_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}