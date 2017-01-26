package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_96 {
    private final Production29_96 production = new Production29_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}