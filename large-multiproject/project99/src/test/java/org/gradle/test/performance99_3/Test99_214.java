package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_214 {
    private final Production99_214 production = new Production99_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}