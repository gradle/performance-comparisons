package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_388 {
    private final Production14_388 production = new Production14_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}