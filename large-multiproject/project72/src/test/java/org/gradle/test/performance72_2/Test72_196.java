package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_196 {
    private final Production72_196 production = new Production72_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}