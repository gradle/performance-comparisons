package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_138 {
    private final Production72_138 production = new Production72_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}