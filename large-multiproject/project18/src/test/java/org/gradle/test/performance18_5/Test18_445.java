package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_445 {
    private final Production18_445 production = new Production18_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}