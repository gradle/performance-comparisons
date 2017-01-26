package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_255 {
    private final Production14_255 production = new Production14_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}