package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_188 {
    private final Production99_188 production = new Production99_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}