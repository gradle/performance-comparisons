package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_100 {
    private final Production99_100 production = new Production99_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}