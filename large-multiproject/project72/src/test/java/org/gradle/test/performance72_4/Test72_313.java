package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_313 {
    private final Production72_313 production = new Production72_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}