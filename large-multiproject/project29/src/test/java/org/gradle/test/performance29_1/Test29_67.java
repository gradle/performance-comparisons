package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_67 {
    private final Production29_67 production = new Production29_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}