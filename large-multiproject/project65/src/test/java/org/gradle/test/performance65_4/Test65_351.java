package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_351 {
    private final Production65_351 production = new Production65_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}