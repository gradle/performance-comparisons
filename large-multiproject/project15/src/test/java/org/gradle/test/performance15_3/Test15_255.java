package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_255 {
    private final Production15_255 production = new Production15_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}