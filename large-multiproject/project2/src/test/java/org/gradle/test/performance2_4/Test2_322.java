package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_322 {
    private final Production2_322 production = new Production2_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}