package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_403 {
    private final Production2_403 production = new Production2_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}