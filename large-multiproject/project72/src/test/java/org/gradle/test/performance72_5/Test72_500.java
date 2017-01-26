package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_500 {
    private final Production72_500 production = new Production72_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}