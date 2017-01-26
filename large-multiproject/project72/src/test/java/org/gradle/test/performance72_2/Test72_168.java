package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_168 {
    private final Production72_168 production = new Production72_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}