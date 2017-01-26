package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_436 {
    private final Production65_436 production = new Production65_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}