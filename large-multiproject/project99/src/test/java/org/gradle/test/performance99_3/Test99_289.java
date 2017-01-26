package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_289 {
    private final Production99_289 production = new Production99_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}