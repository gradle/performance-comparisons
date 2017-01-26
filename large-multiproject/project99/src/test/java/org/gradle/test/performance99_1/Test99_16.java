package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_16 {
    private final Production99_16 production = new Production99_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}