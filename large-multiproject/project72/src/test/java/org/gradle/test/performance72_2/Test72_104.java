package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_104 {
    private final Production72_104 production = new Production72_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}