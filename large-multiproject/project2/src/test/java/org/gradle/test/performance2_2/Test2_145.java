package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_145 {
    private final Production2_145 production = new Production2_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}