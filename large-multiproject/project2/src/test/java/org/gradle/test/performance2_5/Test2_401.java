package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_401 {
    private final Production2_401 production = new Production2_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}