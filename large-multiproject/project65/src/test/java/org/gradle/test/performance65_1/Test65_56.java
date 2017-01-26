package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_56 {
    private final Production65_56 production = new Production65_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}