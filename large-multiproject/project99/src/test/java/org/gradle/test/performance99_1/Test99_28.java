package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_28 {
    private final Production99_28 production = new Production99_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}