package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_330 {
    private final Production2_330 production = new Production2_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}