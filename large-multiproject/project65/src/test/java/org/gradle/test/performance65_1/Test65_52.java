package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_52 {
    private final Production65_52 production = new Production65_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}