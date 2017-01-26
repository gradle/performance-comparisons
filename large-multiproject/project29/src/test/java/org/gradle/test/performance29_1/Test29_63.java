package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_63 {
    private final Production29_63 production = new Production29_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}