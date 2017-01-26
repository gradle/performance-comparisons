package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_231 {
    private final Production2_231 production = new Production2_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}