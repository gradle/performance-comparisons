package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_157 {
    private final Production72_157 production = new Production72_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}