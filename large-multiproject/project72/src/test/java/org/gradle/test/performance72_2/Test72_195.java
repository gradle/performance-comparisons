package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_195 {
    private final Production72_195 production = new Production72_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}