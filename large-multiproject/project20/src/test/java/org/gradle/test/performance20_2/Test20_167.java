package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_167 {
    private final Production20_167 production = new Production20_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}