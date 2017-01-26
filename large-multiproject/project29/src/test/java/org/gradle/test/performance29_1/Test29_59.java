package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_59 {
    private final Production29_59 production = new Production29_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}