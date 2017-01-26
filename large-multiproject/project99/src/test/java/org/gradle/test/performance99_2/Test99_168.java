package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_168 {
    private final Production99_168 production = new Production99_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}