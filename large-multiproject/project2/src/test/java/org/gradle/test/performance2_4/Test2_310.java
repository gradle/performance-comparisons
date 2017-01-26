package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_310 {
    private final Production2_310 production = new Production2_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}