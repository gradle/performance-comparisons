package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_458 {
    private final Production14_458 production = new Production14_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}