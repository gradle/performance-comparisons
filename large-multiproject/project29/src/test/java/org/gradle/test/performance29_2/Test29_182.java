package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_182 {
    private final Production29_182 production = new Production29_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}