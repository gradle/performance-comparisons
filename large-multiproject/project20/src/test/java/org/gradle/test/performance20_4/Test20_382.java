package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_382 {
    private final Production20_382 production = new Production20_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}