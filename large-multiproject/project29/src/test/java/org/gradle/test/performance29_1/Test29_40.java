package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_40 {
    private final Production29_40 production = new Production29_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}