package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_69 {
    private final Production65_69 production = new Production65_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}