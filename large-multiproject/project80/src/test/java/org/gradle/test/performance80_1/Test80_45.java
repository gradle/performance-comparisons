package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_45 {
    private final Production80_45 production = new Production80_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}