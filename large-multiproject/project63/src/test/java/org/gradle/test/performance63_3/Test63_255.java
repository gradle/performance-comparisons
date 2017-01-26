package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_255 {
    private final Production63_255 production = new Production63_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}