package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_89 {
    private final Production99_89 production = new Production99_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}