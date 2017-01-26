package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_157 {
    private final Production29_157 production = new Production29_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}