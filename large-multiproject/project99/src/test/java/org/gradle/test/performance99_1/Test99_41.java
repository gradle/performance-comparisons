package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_41 {
    private final Production99_41 production = new Production99_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}