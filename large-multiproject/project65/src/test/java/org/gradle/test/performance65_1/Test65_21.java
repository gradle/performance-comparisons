package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_21 {
    private final Production65_21 production = new Production65_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}