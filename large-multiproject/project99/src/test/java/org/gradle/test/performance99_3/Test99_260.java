package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_260 {
    private final Production99_260 production = new Production99_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}