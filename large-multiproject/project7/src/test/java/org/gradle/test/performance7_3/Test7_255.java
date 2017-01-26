package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_255 {
    private final Production7_255 production = new Production7_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}