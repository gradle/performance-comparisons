package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_14 {
    private final Production99_14 production = new Production99_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}