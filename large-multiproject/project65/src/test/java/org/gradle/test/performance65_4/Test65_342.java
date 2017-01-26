package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_342 {
    private final Production65_342 production = new Production65_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}