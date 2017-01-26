package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_65 {
    private final Production72_65 production = new Production72_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}