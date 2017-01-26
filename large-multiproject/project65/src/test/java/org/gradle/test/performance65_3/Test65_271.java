package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_271 {
    private final Production65_271 production = new Production65_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}