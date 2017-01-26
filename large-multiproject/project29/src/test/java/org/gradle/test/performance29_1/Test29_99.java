package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_99 {
    private final Production29_99 production = new Production29_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}