package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_126 {
    private final Production29_126 production = new Production29_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}