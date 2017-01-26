package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_484 {
    private final Production2_484 production = new Production2_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}