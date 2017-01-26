package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_26 {
    private final Production2_26 production = new Production2_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}