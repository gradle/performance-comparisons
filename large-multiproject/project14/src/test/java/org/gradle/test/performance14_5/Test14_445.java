package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_445 {
    private final Production14_445 production = new Production14_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}