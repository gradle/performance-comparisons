package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_225 {
    private final Production7_225 production = new Production7_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}