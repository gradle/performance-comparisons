package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_362 {
    private final Production14_362 production = new Production14_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}