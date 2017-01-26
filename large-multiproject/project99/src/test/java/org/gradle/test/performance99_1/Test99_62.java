package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_62 {
    private final Production99_62 production = new Production99_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}