package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_495 {
    private final Production99_495 production = new Production99_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}