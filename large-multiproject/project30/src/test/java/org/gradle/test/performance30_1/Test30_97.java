package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_97 {
    private final Production30_97 production = new Production30_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}