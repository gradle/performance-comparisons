package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_145 {
    private final Production99_145 production = new Production99_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}