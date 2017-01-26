package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_41 {
    private final Production29_41 production = new Production29_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}