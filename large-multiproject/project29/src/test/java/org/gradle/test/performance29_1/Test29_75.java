package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_75 {
    private final Production29_75 production = new Production29_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}