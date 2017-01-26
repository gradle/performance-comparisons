package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_362 {
    private final Production20_362 production = new Production20_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}