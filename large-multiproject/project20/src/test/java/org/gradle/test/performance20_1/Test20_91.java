package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_91 {
    private final Production20_91 production = new Production20_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}