package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_62 {
    private final Production29_62 production = new Production29_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}