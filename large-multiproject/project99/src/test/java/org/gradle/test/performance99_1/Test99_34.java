package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_34 {
    private final Production99_34 production = new Production99_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}