package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_202 {
    private final Production99_202 production = new Production99_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}