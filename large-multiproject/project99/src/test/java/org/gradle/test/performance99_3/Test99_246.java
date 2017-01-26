package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_246 {
    private final Production99_246 production = new Production99_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}