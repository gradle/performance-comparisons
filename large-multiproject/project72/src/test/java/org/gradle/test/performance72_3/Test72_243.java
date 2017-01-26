package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_243 {
    private final Production72_243 production = new Production72_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}