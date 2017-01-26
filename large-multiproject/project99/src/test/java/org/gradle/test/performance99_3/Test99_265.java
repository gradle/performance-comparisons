package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_265 {
    private final Production99_265 production = new Production99_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}