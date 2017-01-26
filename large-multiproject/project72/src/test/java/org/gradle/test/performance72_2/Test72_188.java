package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_188 {
    private final Production72_188 production = new Production72_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}