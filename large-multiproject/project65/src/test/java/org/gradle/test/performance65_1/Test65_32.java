package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_32 {
    private final Production65_32 production = new Production65_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}