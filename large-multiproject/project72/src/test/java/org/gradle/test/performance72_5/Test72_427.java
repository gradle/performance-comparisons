package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_427 {
    private final Production72_427 production = new Production72_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}