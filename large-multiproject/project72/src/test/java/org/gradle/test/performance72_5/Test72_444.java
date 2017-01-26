package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_444 {
    private final Production72_444 production = new Production72_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}