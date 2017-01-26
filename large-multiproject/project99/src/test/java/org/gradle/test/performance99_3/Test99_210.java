package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_210 {
    private final Production99_210 production = new Production99_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}