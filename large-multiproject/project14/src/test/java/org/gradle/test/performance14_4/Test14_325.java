package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_325 {
    private final Production14_325 production = new Production14_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}