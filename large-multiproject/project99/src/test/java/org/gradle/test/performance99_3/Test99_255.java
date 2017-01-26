package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_255 {
    private final Production99_255 production = new Production99_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}