package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_104 {
    private final Production99_104 production = new Production99_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}