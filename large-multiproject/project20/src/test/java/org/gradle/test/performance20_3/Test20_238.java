package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_238 {
    private final Production20_238 production = new Production20_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}