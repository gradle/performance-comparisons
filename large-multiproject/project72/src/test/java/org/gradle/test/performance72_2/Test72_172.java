package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_172 {
    private final Production72_172 production = new Production72_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}