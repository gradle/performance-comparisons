package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_167 {
    private final Production90_167 production = new Production90_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}