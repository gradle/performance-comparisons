package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_92 {
    private final Production72_92 production = new Production72_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}