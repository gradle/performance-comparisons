package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_195 {
    private final Production14_195 production = new Production14_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}