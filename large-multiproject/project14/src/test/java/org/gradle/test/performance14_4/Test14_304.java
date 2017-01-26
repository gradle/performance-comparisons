package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_304 {
    private final Production14_304 production = new Production14_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}