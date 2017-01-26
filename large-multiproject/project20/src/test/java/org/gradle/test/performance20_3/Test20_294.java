package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_294 {
    private final Production20_294 production = new Production20_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}