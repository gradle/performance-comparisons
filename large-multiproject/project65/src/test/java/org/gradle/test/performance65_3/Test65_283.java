package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_283 {
    private final Production65_283 production = new Production65_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}