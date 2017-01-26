package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_112 {
    private final Production72_112 production = new Production72_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}