package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_208 {
    private final Production65_208 production = new Production65_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}