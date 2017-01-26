package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_147 {
    private final Production99_147 production = new Production99_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}