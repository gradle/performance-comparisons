package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_174 {
    private final Production65_174 production = new Production65_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}