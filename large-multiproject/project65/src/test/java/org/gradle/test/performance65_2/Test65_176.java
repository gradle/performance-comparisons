package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_176 {
    private final Production65_176 production = new Production65_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}