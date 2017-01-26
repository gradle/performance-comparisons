package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_297 {
    private final Production99_297 production = new Production99_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}