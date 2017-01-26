package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_350 {
    private final Production72_350 production = new Production72_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}