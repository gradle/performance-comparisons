package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_33 {
    private final Production29_33 production = new Production29_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}