package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_188 {
    private final Production65_188 production = new Production65_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}