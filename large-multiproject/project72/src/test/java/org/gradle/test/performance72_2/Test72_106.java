package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_106 {
    private final Production72_106 production = new Production72_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}