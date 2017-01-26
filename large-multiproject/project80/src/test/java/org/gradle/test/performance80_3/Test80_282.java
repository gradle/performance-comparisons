package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_282 {
    private final Production80_282 production = new Production80_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}