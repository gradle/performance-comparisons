package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_303 {
    private final Production14_303 production = new Production14_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}