package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_228 {
    private final Production99_228 production = new Production99_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}