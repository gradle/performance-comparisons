package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_218 {
    private final Production65_218 production = new Production65_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}