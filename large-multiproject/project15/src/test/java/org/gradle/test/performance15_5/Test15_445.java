package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_445 {
    private final Production15_445 production = new Production15_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}