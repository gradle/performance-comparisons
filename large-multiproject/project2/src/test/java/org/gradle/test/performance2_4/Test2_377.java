package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_377 {
    private final Production2_377 production = new Production2_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}