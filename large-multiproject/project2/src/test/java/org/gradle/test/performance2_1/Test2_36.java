package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_36 {
    private final Production2_36 production = new Production2_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}