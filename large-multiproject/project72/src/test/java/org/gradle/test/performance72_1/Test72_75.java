package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_75 {
    private final Production72_75 production = new Production72_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}