package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_195 {
    private final Production20_195 production = new Production20_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}