package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_255 {
    private final Production18_255 production = new Production18_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}