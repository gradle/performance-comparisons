package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_156 {
    private final Production72_156 production = new Production72_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}