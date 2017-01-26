package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_255 {
    private final Production49_255 production = new Production49_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}