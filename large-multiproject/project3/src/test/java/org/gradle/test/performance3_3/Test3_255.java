package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_255 {
    private final Production3_255 production = new Production3_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}