package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_450 {
    private final Production29_450 production = new Production29_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}