package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_302 {
    private final Production99_302 production = new Production99_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}