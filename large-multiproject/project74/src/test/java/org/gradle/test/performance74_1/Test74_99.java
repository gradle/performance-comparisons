package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_99 {
    private final Production74_99 production = new Production74_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}