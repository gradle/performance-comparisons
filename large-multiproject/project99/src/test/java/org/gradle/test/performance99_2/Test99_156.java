package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_156 {
    private final Production99_156 production = new Production99_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}