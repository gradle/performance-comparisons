package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_253 {
    private final Production99_253 production = new Production99_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}