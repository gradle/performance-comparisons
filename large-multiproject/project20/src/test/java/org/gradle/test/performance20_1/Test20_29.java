package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_29 {
    private final Production20_29 production = new Production20_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}