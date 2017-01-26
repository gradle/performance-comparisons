package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_97 {
    private final Production7_97 production = new Production7_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}