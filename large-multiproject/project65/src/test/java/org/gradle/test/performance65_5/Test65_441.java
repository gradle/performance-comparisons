package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_441 {
    private final Production65_441 production = new Production65_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}