package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_405 {
    private final Production2_405 production = new Production2_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}