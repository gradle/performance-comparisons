package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_107 {
    private final Production99_107 production = new Production99_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}