package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_193 {
    private final Production65_193 production = new Production65_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}