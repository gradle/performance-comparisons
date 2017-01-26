package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_255 {
    private final Production90_255 production = new Production90_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}