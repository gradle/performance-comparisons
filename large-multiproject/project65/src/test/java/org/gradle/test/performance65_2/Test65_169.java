package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_169 {
    private final Production65_169 production = new Production65_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}