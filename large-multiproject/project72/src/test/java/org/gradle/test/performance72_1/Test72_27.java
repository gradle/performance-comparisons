package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_27 {
    private final Production72_27 production = new Production72_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}