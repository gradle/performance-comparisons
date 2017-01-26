package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_390 {
    private final Production99_390 production = new Production99_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}