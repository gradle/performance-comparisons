package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_315 {
    private final Production72_315 production = new Production72_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}