package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_196 {
    private final Production99_196 production = new Production99_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}