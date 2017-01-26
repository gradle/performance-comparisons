package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_445 {
    private final Production30_445 production = new Production30_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}