package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_167 {
    private final Production26_167 production = new Production26_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}