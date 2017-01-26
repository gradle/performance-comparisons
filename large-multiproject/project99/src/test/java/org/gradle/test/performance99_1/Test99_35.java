package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_35 {
    private final Production99_35 production = new Production99_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}