package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_377 {
    private final Production72_377 production = new Production72_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}