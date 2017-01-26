package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_98 {
    private final Production99_98 production = new Production99_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}