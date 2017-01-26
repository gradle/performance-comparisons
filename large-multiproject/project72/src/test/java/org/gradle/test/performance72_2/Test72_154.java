package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_154 {
    private final Production72_154 production = new Production72_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}