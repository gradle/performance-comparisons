package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_356 {
    private final Production99_356 production = new Production99_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}