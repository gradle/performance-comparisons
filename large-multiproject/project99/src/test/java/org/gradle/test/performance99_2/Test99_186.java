package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_186 {
    private final Production99_186 production = new Production99_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}