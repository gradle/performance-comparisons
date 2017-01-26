package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_468 {
    private final Production65_468 production = new Production65_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}