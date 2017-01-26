package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_109 {
    private final Production14_109 production = new Production14_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}