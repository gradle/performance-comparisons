package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_236 {
    private final Production65_236 production = new Production65_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}