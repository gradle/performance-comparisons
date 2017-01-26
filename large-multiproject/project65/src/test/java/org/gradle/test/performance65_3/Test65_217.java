package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_217 {
    private final Production65_217 production = new Production65_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}