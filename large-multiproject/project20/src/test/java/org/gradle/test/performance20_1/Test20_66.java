package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_66 {
    private final Production20_66 production = new Production20_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}