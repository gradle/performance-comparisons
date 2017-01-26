package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_195 {
    private final Production65_195 production = new Production65_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}