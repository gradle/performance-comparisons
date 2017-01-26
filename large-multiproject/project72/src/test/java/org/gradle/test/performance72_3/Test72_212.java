package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_212 {
    private final Production72_212 production = new Production72_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}