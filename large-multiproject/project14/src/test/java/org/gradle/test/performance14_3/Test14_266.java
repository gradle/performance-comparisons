package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_266 {
    private final Production14_266 production = new Production14_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}