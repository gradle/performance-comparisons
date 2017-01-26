package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_201 {
    private final Production65_201 production = new Production65_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}