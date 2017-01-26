package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_182 {
    private final Production72_182 production = new Production72_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}