package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_268 {
    private final Production99_268 production = new Production99_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}