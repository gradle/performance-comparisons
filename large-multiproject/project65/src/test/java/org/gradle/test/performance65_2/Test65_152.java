package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_152 {
    private final Production65_152 production = new Production65_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}