package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_255 {
    private final Production74_255 production = new Production74_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}