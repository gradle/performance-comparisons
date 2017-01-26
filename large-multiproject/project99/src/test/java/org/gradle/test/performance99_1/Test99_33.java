package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_33 {
    private final Production99_33 production = new Production99_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}