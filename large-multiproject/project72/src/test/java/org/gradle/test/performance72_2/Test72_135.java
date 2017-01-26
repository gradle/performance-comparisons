package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_135 {
    private final Production72_135 production = new Production72_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}