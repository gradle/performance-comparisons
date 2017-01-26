package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_255 {
    private final Production60_255 production = new Production60_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}