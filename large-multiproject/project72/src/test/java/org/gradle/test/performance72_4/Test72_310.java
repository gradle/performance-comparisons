package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_310 {
    private final Production72_310 production = new Production72_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}