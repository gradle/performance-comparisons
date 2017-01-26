package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_162 {
    private final Production65_162 production = new Production65_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}