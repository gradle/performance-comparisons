package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_242 {
    private final Production65_242 production = new Production65_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}