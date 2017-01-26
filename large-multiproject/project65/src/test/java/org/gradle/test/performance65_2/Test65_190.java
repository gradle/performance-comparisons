package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_190 {
    private final Production65_190 production = new Production65_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}