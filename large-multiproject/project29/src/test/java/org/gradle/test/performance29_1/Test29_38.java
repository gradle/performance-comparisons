package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_38 {
    private final Production29_38 production = new Production29_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}