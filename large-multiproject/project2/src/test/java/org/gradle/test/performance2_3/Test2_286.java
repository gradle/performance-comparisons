package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_286 {
    private final Production2_286 production = new Production2_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}