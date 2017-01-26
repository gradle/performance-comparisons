package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_167 {
    private final Production99_167 production = new Production99_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}