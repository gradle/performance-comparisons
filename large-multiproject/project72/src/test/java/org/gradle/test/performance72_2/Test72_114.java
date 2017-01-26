package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_114 {
    private final Production72_114 production = new Production72_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}