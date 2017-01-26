package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_457 {
    private final Production99_457 production = new Production99_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}