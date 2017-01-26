package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_485 {
    private final Production65_485 production = new Production65_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}