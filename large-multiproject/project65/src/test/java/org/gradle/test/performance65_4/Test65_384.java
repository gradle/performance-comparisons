package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_384 {
    private final Production65_384 production = new Production65_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}