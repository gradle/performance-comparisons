package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_26 {
    private final Production99_26 production = new Production99_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}