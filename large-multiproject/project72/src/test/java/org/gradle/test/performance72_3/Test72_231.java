package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_231 {
    private final Production72_231 production = new Production72_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}