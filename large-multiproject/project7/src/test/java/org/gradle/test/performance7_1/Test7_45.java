package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_45 {
    private final Production7_45 production = new Production7_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}