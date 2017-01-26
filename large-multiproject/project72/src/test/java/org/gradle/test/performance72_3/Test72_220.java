package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_220 {
    private final Production72_220 production = new Production72_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}