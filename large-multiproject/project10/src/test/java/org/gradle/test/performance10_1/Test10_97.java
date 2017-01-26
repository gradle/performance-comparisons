package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_97 {
    private final Production10_97 production = new Production10_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}