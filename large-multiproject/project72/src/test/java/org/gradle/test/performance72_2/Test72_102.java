package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_102 {
    private final Production72_102 production = new Production72_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}