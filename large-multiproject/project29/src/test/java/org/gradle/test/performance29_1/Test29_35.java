package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_35 {
    private final Production29_35 production = new Production29_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}