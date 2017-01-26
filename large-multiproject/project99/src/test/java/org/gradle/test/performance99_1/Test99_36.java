package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_36 {
    private final Production99_36 production = new Production99_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}