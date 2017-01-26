package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_338 {
    private final Production20_338 production = new Production20_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}