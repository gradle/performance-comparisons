package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_293 {
    private final Production2_293 production = new Production2_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}