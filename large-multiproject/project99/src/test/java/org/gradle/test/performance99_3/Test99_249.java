package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_249 {
    private final Production99_249 production = new Production99_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}