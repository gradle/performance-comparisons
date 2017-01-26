package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_238 {
    private final Production99_238 production = new Production99_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}