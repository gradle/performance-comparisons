package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_175 {
    private final Production72_175 production = new Production72_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}