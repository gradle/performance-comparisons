package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_255 {
    private final Production50_255 production = new Production50_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}