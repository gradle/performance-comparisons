package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_49 {
    private final Production80_49 production = new Production80_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}