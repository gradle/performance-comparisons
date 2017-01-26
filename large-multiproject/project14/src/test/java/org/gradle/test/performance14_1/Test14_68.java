package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_68 {
    private final Production14_68 production = new Production14_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}