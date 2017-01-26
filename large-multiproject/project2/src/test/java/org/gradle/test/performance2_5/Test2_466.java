package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_466 {
    private final Production2_466 production = new Production2_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}