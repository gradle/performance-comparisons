package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_183 {
    private final Production72_183 production = new Production72_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}