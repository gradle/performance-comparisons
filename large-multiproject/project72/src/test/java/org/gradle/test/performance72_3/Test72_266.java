package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_266 {
    private final Production72_266 production = new Production72_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}