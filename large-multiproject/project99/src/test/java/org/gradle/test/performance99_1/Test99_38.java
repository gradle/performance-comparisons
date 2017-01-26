package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_38 {
    private final Production99_38 production = new Production99_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}