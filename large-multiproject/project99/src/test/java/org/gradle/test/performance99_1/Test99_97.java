package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_97 {
    private final Production99_97 production = new Production99_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}