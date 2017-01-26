package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_3 {
    private final Production20_3 production = new Production20_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}