package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_322 {
    private final Production65_322 production = new Production65_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}