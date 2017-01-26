package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_168 {
    private final Production20_168 production = new Production20_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}