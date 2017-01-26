package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_34 {
    private final Production72_34 production = new Production72_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}