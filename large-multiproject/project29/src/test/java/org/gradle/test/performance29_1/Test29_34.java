package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_34 {
    private final Production29_34 production = new Production29_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}