package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_255 {
    private final Production92_255 production = new Production92_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}