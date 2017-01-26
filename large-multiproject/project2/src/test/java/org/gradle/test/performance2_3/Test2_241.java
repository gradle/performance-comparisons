package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_241 {
    private final Production2_241 production = new Production2_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}