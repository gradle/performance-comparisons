package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_246 {
    private final Production20_246 production = new Production20_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}