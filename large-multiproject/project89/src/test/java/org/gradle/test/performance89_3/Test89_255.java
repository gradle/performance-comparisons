package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_255 {
    private final Production89_255 production = new Production89_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}