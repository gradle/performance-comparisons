package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_500 {
    private final Production2_500 production = new Production2_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}