package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_2 {
    private final Production20_2 production = new Production20_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}