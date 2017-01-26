package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_418 {
    private final Production65_418 production = new Production65_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}