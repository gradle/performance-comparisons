package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_90 {
    private final Production99_90 production = new Production99_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}