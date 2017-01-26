package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_338 {
    private final Production99_338 production = new Production99_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}