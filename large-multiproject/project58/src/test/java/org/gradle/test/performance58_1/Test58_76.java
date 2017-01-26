package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_76 {
    private final Production58_76 production = new Production58_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}