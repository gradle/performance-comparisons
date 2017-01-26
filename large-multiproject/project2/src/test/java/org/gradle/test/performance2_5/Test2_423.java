package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_423 {
    private final Production2_423 production = new Production2_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}