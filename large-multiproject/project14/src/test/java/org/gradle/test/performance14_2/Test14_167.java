package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_167 {
    private final Production14_167 production = new Production14_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}