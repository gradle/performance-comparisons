package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_65 {
    private final Production99_65 production = new Production99_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}