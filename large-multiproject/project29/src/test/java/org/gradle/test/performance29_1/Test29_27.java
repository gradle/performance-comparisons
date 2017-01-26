package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_27 {
    private final Production29_27 production = new Production29_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}