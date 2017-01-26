package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_480 {
    private final Production65_480 production = new Production65_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}