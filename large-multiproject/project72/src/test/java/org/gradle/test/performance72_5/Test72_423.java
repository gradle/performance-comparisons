package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_423 {
    private final Production72_423 production = new Production72_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}