package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_45 {
    private final Production14_45 production = new Production14_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}