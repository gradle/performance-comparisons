package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_162 {
    private final Production2_162 production = new Production2_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}