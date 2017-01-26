package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_287 {
    private final Production65_287 production = new Production65_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}