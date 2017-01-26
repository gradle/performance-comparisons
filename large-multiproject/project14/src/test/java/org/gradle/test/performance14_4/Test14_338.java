package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_338 {
    private final Production14_338 production = new Production14_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}