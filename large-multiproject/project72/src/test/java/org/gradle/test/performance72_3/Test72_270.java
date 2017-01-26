package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_270 {
    private final Production72_270 production = new Production72_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}