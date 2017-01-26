package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_255 {
    private final Production43_255 production = new Production43_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}