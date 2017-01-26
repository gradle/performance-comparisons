package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_418 {
    private final Production2_418 production = new Production2_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}