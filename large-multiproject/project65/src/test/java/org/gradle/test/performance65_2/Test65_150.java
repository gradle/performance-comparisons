package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_150 {
    private final Production65_150 production = new Production65_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}