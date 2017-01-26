package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_145 {
    private final Production72_145 production = new Production72_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}