package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_143 {
    private final Production65_143 production = new Production65_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}