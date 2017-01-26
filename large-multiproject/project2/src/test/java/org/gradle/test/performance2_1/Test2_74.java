package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_74 {
    private final Production2_74 production = new Production2_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}