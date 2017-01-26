package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_445 {
    private final Production74_445 production = new Production74_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}