package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_134 {
    private final Production99_134 production = new Production99_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}