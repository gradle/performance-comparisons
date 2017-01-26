package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_160 {
    private final Production65_160 production = new Production65_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}