package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_252 {
    private final Production65_252 production = new Production65_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}