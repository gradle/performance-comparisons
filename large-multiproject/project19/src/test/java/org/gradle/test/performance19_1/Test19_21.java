package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_21 {
    private final Production19_21 production = new Production19_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}