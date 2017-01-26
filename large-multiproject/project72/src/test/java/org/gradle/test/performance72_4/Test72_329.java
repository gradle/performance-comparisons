package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_329 {
    private final Production72_329 production = new Production72_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}