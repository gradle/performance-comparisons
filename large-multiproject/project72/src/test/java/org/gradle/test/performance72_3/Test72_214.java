package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_214 {
    private final Production72_214 production = new Production72_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}