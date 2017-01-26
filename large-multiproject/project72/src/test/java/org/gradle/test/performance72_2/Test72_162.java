package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_162 {
    private final Production72_162 production = new Production72_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}