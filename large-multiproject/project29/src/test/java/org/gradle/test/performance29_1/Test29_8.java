package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_8 {
    private final Production29_8 production = new Production29_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}