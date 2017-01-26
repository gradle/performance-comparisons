package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_29 {
    private final Production99_29 production = new Production99_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}