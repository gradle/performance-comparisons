package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_238 {
    private final Production72_238 production = new Production72_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}