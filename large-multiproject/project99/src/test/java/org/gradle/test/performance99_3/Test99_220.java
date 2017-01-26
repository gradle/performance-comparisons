package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_220 {
    private final Production99_220 production = new Production99_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}