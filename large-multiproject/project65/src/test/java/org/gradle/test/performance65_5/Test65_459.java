package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_459 {
    private final Production65_459 production = new Production65_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}