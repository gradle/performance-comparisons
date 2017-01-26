package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_444 {
    private final Production99_444 production = new Production99_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}