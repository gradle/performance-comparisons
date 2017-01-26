package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_15 {
    private final Production99_15 production = new Production99_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}