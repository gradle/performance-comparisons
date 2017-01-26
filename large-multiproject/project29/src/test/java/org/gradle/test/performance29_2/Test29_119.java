package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_119 {
    private final Production29_119 production = new Production29_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}