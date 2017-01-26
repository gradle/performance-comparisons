package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_161 {
    private final Production72_161 production = new Production72_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}