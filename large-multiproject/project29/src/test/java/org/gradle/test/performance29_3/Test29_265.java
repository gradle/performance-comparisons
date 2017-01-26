package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_265 {
    private final Production29_265 production = new Production29_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}