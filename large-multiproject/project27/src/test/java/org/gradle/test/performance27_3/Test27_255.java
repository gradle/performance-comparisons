package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_255 {
    private final Production27_255 production = new Production27_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}