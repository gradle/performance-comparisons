package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_382 {
    private final Production99_382 production = new Production99_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}