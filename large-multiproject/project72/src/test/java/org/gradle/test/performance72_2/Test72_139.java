package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_139 {
    private final Production72_139 production = new Production72_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}