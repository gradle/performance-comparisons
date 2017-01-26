package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_167 {
    private final Production15_167 production = new Production15_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}