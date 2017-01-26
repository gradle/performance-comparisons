package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_8 {
    private final Production99_8 production = new Production99_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}