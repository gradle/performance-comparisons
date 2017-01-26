package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_136 {
    private final Production65_136 production = new Production65_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}