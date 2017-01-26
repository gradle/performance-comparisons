package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_398 {
    private final Production72_398 production = new Production72_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}