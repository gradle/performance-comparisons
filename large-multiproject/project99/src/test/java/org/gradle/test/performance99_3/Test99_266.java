package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_266 {
    private final Production99_266 production = new Production99_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}