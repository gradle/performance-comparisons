package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_145 {
    private final Production65_145 production = new Production65_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}