package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_80 {
    private final Production29_80 production = new Production29_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}