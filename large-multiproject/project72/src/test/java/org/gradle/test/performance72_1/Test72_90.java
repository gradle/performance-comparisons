package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_90 {
    private final Production72_90 production = new Production72_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}